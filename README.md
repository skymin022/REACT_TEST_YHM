# REACT_TEST_YHM
REACT_TEST_YHM


# 프로젝트 생성 명령어
npx create-react-app 
create-vite client --template react

### react router dom
npm install react-router-dom

### axios
npm install axios



# 서버측 설정 
1. dependency 
    - spring web
    - spring boot dev tools
    - lombok
    - mysql
    - mybatis
    - openapi

dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-web'
	compileOnly 'org.projectlombok:lombok'
	developmentOnly 'org.springframework.boot:spring-boot-devtools'
	runtimeOnly 'com.mysql:mysql-connector-j'
	annotationProcessor 'org.projectlombok:lombok'
	providedRuntime 'org.springframework.boot:spring-boot-starter-tomcat'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
	testRuntimeOnly 'org.junit.platform:junit-platform-launcher'
	// myBatis
	implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.4'
	testImplementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter-test:3.0.4'
	// Springdoc openapi                                                                                                         
	implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.7.0'
	// pagehelper
    implementation 'com.github.pagehelper:pagehelper-spring-boot-starter:2.1.0'
}



2. 테이블 생성 
    - todos 테이블 생성
    - domain
    - mapper
    - service
    - serviceimpl
    - controller
    - pagination 
    - openAPI config 
    - data source - application.properties

    
    # PageHelper 설정
    pagehelper.helperDialect=mysql
    pagehelper.reasonable=true
    pagehelper.supportMethodsArguments=true
    pagehelper.params=count=countSql

    # 데이터 소스 - MySQL
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.url=jdbc:mysql://127.0.0.1:3306/todolist?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false&autoReconnection=true&autoReconnection=true
    spring.datasource.username=aloha
    spring.datasource.password=123456

    # Mybatis 설정
    mybatis.configuration.map-underscore-to-camel-case=true
    mybatis.type-aliases-package=com.yhm.todolist.domain
    mybatis.mapper-locations=classpath:mybatis/mapper/**/**.xml 

    # 로깅 레벨 
    # - ALL, TRACE, DEBUG, INFO, WARN, ERROR, OFF
    logging.level.root=DEBUG
    logging.level.com.aloha.todo=DEBUG


# 프런트 앤드측 설정 




