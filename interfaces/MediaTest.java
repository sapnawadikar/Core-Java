package com.interfaces;

public class MediaTest {
	/*
	 * 2. Media Player System: Create an interface `MediaPlayable` with methods
	 * `play()`, `pause()`, and `stop()`. Implement two classes `AudioPlayer` and
	 * `VideoPlayer` with specific play/pause/stop functionality. Write a program to
	 * allow the user to choose between audio and video playback, and perform
	 * actions dynamically using interface references.
	 */
	public static void main(String[] args) {
		MediaPlayable player = new AudioPlayer();
		player.play();
		player.pause();
		player.stop();
		player = new VideoPlayer();
		player.play();
		player.pause();
		player.stop();
	}
}
