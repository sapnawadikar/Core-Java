package com.interfaces;

public class AudioPlayer implements MediaPlayable {
	public void play() {
		System.out.println("Playing audio...");
	}

	public void pause() {
		System.out.println("Audio paused.");
	}

	public void stop() {
		System.out.println("Audio stopped.");
	}
}
