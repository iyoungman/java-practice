# java-practice
> Study

## Equals And HashCode

## Deep Copy vs Shallow Copy

## Java9 Module  
https://iyoungman.github.io/java/Java9-Module/  

## Reflection
* 컴파일 타임에 클래스의 Type 정보를 알지 못해도 런타임에 Type 정보를 알 수 있다.
* 어디에 활용될까?
  * nnotation
  * private method
    
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
  
