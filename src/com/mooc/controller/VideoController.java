package com.mooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mooc.service.VideoService;

@Controller
public class VideoController {
	@Autowired
	private static VideoService videoService;
}