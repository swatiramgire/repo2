//package com.SpringBootAssignment.SpringBootRestApp.service;
//
//import java.awt.PageAttributes.MediaType;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.mock.web.MockHttpServletResponse;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import com.SpringBootAssignment.SpringBootRestApp.controller.MyController;
//import com.SpringBootAssignment.SpringBootRestApp.entities.FoodMenu;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(value = MyController.class)
//public class MyControllerTest {
//
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@MockBean
//	private FoodMenuService FoodMenuService;
//
//	String exampleFoodMenuJSON="{\"id\":\"1\",\"foodName\":\"newFood\",\"description\":\"newDesc\"}";
//	
//	@Test
//	public void testaddFood() throws Exception{
//		FoodMenu Mockfm=new FoodMenu();
//		Mockfm.setId(1);
//		Mockfm.setFoodName("newFood");
//		Mockfm.setDescription("newDesc");
//		
//		String inputinJSON=this.mapToJson(Mockfm);
//		
//		String URL="getData/FoodMenu";
//		
//		Mockito.when(FoodMenuService.addFood(Mockito.any(FoodMenu.class))).thenReturn(Mockfm);
//		
//		RequestBuilder requestBuilder=MockMvcRequestBuilders
//				.post(URL)
//				.accept(MediaType.APPLICATION_JSON).content(inputinJSON)
//				.contentType(MediaType.APPLICATION_JSON);
//		
//		MvcResult result=mockMvc.perform(requestBuilder).andReturn();
//		MockHttpServletResponse response=result.getResponse();
//		
//		String outputInJson=response.getContentAsString();
//		assertThat(outputInJson).isEqualTo(inputinJSON);
//		assertEquals(HttpSttaus.OK.value(),response.getStatus());
//			}
//	
//	private String mapToJson(Object Object) throws JsonProcessingException
//	{
//		ObjectMapper ObjectMapper=new ObjectMapper();
//		return ObjectMapper.writeValueAsString(Object);
//		
//	}
//	
//}
