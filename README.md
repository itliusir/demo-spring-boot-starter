## Demo-Spring-Boot-Starter

## 自定义Starter

### Test

- maven

```xml
    <dependency>
        <groupId>com.itliusir</groupId>
        <artifactId>demo-spring-boot-starter</artifactId>
        <version>0.0.1-SNAPSHOT</version>
    </dependency>
```

- yaml

```yaml
    user:
      config:
        enabled: true
        name: spring-boot-starter
        age: 18
        details:
          school: spring
          info: balabala
```

- java code

```java
    @Autowired
    private IUserService iUserService;
```

### 参考文档

- 第三方Starters...
- [configuration-processor](https://docs.spring.io/spring-boot/docs/1.5.6.RELEASE/reference/html/configuration-metadata.html)