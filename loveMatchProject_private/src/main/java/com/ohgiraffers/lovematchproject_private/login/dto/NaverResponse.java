//package com.ohgiraffers.lovematchproject.login.dto;
//
//import java.util.Map;
//
//public class NaverResponse implements OAuth2Response{
//    private final Map<String, Object> attribute;
//
//    public NaverResponse(Map<String, Object> attribute) {
//        // attribute.get("response")의 반환값은 Object이기 때문에 타입캐스팅
//        this.attribute = (Map<String, Object>) attribute.get("response");
//    }
//
//    @Override
//    public String getProvider() {
//        return "naver";
//    }
//
//    @Override
//    public String getProviderId() {
//        return attribute.get("id").toString();
//    }
//
//    @Override
//    public String getEmail() {
//        return attribute.get("email").toString();
//    }
//
//    @Override
//    public String getName() {
//        return attribute.get("name").toString();
//    }
//}
