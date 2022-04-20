package com.smalltest.sample.cucumber;

import java.util.List;

import io.cucumber.java.DataTableType;
import io.cucumber.java.DocStringType;
import io.cucumber.java.ParameterType;
import io.cucumber.messages.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.JsonMappingException;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.JsonNode;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.ObjectMapper;

public class CustomParameterType {
@DataTableType
public User userEntry(List<String>row) {
	return new User(row.get(0),row.get(1),row.get(2));
}

private static ObjectMapper objectMapper = new ObjectMapper();
@DocStringType
public JsonNode json(String docStr) throws JsonMappingException, JsonProcessingException
{
	return objectMapper.readValue(docStr, JsonNode.class);
}

@ParameterType("red|blue|yellow")
public Color color(String col)
{
	return new Color(col);
}

}
