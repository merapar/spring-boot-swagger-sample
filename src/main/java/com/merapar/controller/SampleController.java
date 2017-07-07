package com.merapar.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {
	@GetMapping(value = "/sample", produces = MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<Sample> sample() {
		return new ResponseEntity<>(new Sample("sampleValue", Sample.CodeEnum.ENUM2), HttpStatus.OK);
	}
}
