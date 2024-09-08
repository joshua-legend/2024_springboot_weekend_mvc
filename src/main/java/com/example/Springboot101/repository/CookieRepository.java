package com.example.Springboot101.repository;

import com.example.Springboot101.model.Cookie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

//public interface CookieRepository extends JpaRepository<Cookie, Integer> {
    //Query Method: 키워드에 따라서 SQL이 자동완성됨

    //1. 비교 연산자( == ,=!, <, > )
    // Is,Equals(==)
//    Cookie findByNameIs(String name);
//
//    // IsNot, Not(=!)
//    Cookie findByNameIsNot(String name);
//
//    // GreaterThan(>), GreaterThanEqual(>=), LessThan(<), LessThanEqual(<=), Between
//    List<Cookie> findByPriceGreaterThan(Integer price);
//    List<Cookie> findByPriceBetween(Integer start, Integer end);
//
//    // 2.논리 연산자 (And, Or)
//    List<Cookie> findByNameAndPrice(String name,Integer price);
//    List<Cookie> findByNameOrPrice(String name,Integer price);
//
//
//    //네이티브 쿼리 or JPQL
//    @Query("SELECT name FROM COOKIE WHERE COOKIE.NAME = :nickname")
//    List<Cookie> findByNameABCD(@Param("nickname") String nickname);


//}
