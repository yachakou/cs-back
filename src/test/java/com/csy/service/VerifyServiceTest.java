//package com.csy.demo.service;
//
//import DemoApplicationTests;
//import CreateEventBody;
//import VerifyResponse;
//import org.assertj.core.api.Assertions;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class VerifyServiceTest extends DemoApplicationTests {
//
//    @Autowired
//    private VerifyService verifyService;
//
//    private static final String PARAM_OK = "123";
//    private static final String PARAM_KO = null;
//    private static CreateEventBody VALID_BODY_REGISTER ;
//
//    @Before public void initialize() {
//        VALID_BODY_REGISTER = CreateEventBody.builder().mail("mail").name("name").build();
//    }
//
//
//    @Test
//    public void should_return_ok_when_param_are_ok_when_call_verify() {
//        Object T = verifyService.verify(PARAM_OK);
//        verifyBasic(T);
//        Assertions.assertThat((VerifyResponse) T).isEqualTo(VerifyServiceTest.verifyFactory(PARAM_OK));
//    }
//
//    @Test
//    public void should_return_ko_when_param_are_null_when_call_verify() {
//        Object T = verifyService.verify(PARAM_KO);
//        verifyBasic(T);
//        Assertions.assertThat((VerifyResponse) T).isEqualTo(VerifyServiceTest.verifyFactory(PARAM_KO));
//    }
//
//    @Test
//    public void  should_return_ok_when_param_are_null_when_call_register(){
//        VerifyResponse T = verifyService.createEvent(VALID_BODY_REGISTER);
//        verifyBasic(T);
//        VerifyResponse verifyResponse = VerifyServiceTest.registerFactory(VALID_BODY_REGISTER);
//        Assertions.assertThat(T.getId()).isNotEmpty();
//        Assertions.assertThat(T.getStatus()).isEqualTo(verifyResponse.getStatus());
//        Assertions.assertThat(T.isVerified()).isEqualTo(verifyResponse.isVerified());
//    }
//
//
//    private static VerifyResponse verifyFactory(String param) {
//        if (null == param) {
//            return VerifyResponse.builder().status("KO").isVerified(false).build();
//        }
//        return VerifyResponse.builder().status("OK").isVerified(true).build();
//    }
//
//    private static VerifyResponse registerFactory(CreateEventBody param) {
//        return VerifyResponse.builder().status("OK").isVerified(true).id("id").build();
//    }
//
//    private void verifyBasic(Object t) {
//        Assertions.assertThat(t).isNotNull();
//        Assertions.assertThat(t).isInstanceOf(VerifyResponse.class);
//    }
//
//}