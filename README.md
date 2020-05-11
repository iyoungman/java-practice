# java-practice
> Study

## Equals And HashCode  
https://iyoungman.github.io/java/Java-Equals-and-HashCode/  

## Deep Copy vs Shallow Copy

## Java9 Module  
https://iyoungman.github.io/java/Java9-Module/  

## Reflection
* 컴파일 타임에 클래스의 Type 정보를 알지 못해도 런타임에 Type 정보를 가져올 수 있다.
* 어디에 활용될까?
  * annotation
  * private method
  * jdbc driver  
* 참고
  * http://tutorials.jenkov.com/java-reflection/index.html
    
<br>
  
* Spring의 `RequestMappingHandlerMapping.class` 일부
1) 특정 Bean에 @RequetMapping 이 있는지 확인
2) @RequetMapping의 정보를 바탕으로 다음동작 처리

```java
@Override
protected boolean isHandler(Class<?> beanType) {
    return (AnnotatedElementUtils.hasAnnotation(beanType, Controller.class) ||
        AnnotatedElementUtils.hasAnnotation(beanType, RequestMapping.class));//(1)
}

protected RequestMappingInfo createRequestMappingInfo(RequestMapping requestMapping, //(2)
                                                      @Nullable RequestCondition<?> customCondition) {

    RequestMappingInfo.Builder builder = RequestMappingInfo
        .paths(resolveEmbeddedValuesInPatterns(requestMapping.path()))
        .methods(requestMapping.method())
        .params(requestMapping.params())
        .headers(requestMapping.headers())
        .consumes(requestMapping.consumes())
        .produces(requestMapping.produces())
        .mappingName(requestMapping.name());
    if (customCondition != null) {
      builder.customCondition(customCondition);
    }
    return builder.options(this.config).build();
}
```

## Serializable
* 직렬화란?
    * 외부 자바 시스템에서도 사용할 수 있도록
    * 객체를 전송 가능한 형태로 만드는 것

* serialVersionUID
    * 직렬화에 사용되는 고유 ID
    * 선언하지 않으면 JVM에서 자동 생성
    * 명시적으로 선언해주지 않으면 객체 내부 정보가 변경되었을 때
    * 다른 serialVersionUID가 자동 생성되므로 에러가 발생한다.
    * 따라서 명시적으로 선언해주자.
   
* 자동 생성
    * https://sidekick.tistory.com/524
  
## ThreadLocal
* 같은 Thread 내에서 전역적으로 값을 공유할 수 있도록 하는것 