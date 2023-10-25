# Spring-boot-project

This is my Spring Boot project from the course [Learn Spring Boot 3 in 100 steps](https://www.udemy.com/course/spring-boot-tutorial-for-beginners/?utm_source=adwords&utm_medium=udemyads&utm_campaign=WebDevelopment_v.PROF_la.EN_cc.BR_ti.8322&utm_content=deal4584&utm_term=_._ag_108455848694_._ad_467154447027_._kw__._de_c_._dm__._pl__._ti_dsa-774930035449_._li_1001542_._pd__._&matchtype=&gclid=CjwKCAjwg4SpBhAKEiwAdyLwvKyKctaO79d5MVy6rvOThdRYRtw8cNMyVJDRFYvurznQiCWMAuxdIxoCwqoQAvD_BwE). 


## Technologias

- Spring Boot
- H2 Database
- Postman
- HTML and CSS
- JSP
- JDBC
- JPA
- Lombok

## A view of the pages

The ToDo page

<img src="https://github.com/magno-brito/Spring-boot-project/assets/84158231/b64ea597-e81d-439e-b921-08ec7b8dabf3"  width="70%" height="70%">


The Database H2

<img src="https://github.com/magno-brito/Spring-boot-project/assets/84158231/49cdd4f8-86fb-489d-88fb-39edfc6ad948" width="70%" height="70%">




## Notes from the journey

### Spring Data
When we add Data JPA (Jacarta Persistence API) in our project, spring boot auto configuration does some things like initialize JPA and spring data JPA frameworks.
We also added H2 database and with the annotation @Entity in our model class, we can create our database without making it in a file. The setup connection is also made from the application to the in-memory database using the Spring Data.

We also used JDBC (Java Database Connectivity) to make some operations in our database like findById or delete some data. Using jdbc can be tricky, this is why we prefer JPA. It's faster and we write less code. 

Using the annotation @Repository, we created a interface that extended JpaRepository interface. We also created a repository instance of this interface to make operations in the database like findById, save and delete. 

### Using JUnit and Mockito
I used JUnit and Mockito to run some tests in my application. To do this tests we need to use annotations like @Mock and @Test. I also needed to add the @ExtendWith to  avoid null instances in the class.

```
@ExtendWith(MockitoExtension.class)
public class TestingMockito {

    @Mock
    private ToDo todo;

    @Mock
    private TodoRepository repository;

    @InjectMocks
    private ToDoControllerJpa todoControllerJpa;


    @Test
    void testRepository() {
        repository.deleteById(1);

    }

}

```




