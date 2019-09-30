package structural.facade.facade;

import structural.facade.behavior.AudioMixer;
import structural.facade.behavior.BitrateReader;
import structural.facade.codec.Codec;
import structural.facade.codec.CodecFactory;
import structural.facade.entities.VideoFile;
import structural.facade.enums.FileType;

import java.io.File;

/**
 * Created by HauKute on 10/1/2019.
 */
public class VideoConversionFacade {
	public File convertVideo(String fileName, String format) {
		System.out.println("Video Conversion Facade: conversion started.");
		VideoFile file = new VideoFile(fileName);
		Codec sourceCodec = CodecFactory.getInstance(file);
		Codec destinationCodec = CodecFactory.getInstance(format);

		VideoFile buffer = BitrateReader.read(file, sourceCodec);
		VideoFile intermediaResult = BitrateReader.convert(buffer, destinationCodec);
		File result = (new AudioMixer()).fix(intermediaResult);
		System.out.println("VideoConversionFacade: conversion completed.");
		return result;
	}
}
