## app-pay 项目说明文档
### 1. 项目结构
<pre>

</pre>

工程为父子结构,基于springboot框架实现,整合过程中遇到的问题及解决方式:
- springboot依赖包替换指定版本, 业务使用中,我们都希望使用尽可能稳定的或者熟悉的版本,为了项目运行稳定。
    ```xml
      <properties>
              <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
              <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
              <java.version>1.7</java.version>
              <fastjson.version>1.2.38</fastjson.version>
              <mybatis-spring-version>1.1.0</mybatis-spring-version>
              <guava.version>18.0</guava.version>
              <spring-boot-mybatis.version>2.0.0</spring-boot-mybatis.version>
              <spring-boot-starter-log4j.version>1.3.8.RELEASE</spring-boot-starter-log4j.version>
              <oracle.version>11.2.0.3</oracle.version>
              <druid.version>1.1.10</druid.version>
              <druid-monitor-version>1.1.1</druid-monitor-version>
          </properties>
    ```
    pom.xml文件中指定版本即可,springboot依赖的版本名称可以从官网文档中查询,这里就不再列举了。
- 构建编译，实际生产环境中，我们都是使用的独立tomcat部署业务系统，便于运维同事的管理，springboot本身内嵌了tomcat，我们再开发过程用于调试还是很方便的，我们需要解决怎么打包时排除内嵌tomcat，并且让springboot项目像既有方式部署呢。
    ```xml
    <dependencies>
       <dependency>
            <groupId>org.springframework.boot</groupId>
               <artifactId>spring-boot-starter-web</artifactId>
                  <exclusions>
                      <exclusion>
                          <groupId>org.springframework.boot</groupId>
                          <artifactId>spring-boot-starter-tomcat</artifactId>
                      </exclusion>
                  </exclusions>
       </dependency>
      
       <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-tomcat</artifactId>
              <scope>provided</scope>
       </dependency>
    </dependencies>
    ```
    **main入口改造**
    ```java
     @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
     public class ApiApplication extends SpringBootServletInitializer {
     
         @Override
         protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
             return  builder.sources(ApiApplication.class);
         }
     
         public static void main(String[] args) {
             new SpringApplicationBuilder(ApiApplication.class).web(true).run(args);
         }
     }
    ```
- 目前集成的三方工具:
    
    DruidDataSource 阿里开源的数据源中间件
    
    Redis           缓存
    
    RedisTemplate   Redis客户端实用的是springboot支持的工具
    
    Schedule        定时调度任务
    
    _配置方式,通过@Configuration注解跟Class的形式,属性值通过properties定义,由springboot自动读取注入,减少尽量不使用XML形式_

  
  

