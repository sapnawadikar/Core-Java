package com.interfaces;

public class VideoPlayer implements MediaPlayable {

	public void play() {
		System.out.println("Playing video...");
	}

	public void pause() {
		System.out.println("Video paused.");
	}

	public void stop() {
		System.out.println("Video stopped.");
	}
}
