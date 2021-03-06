package me.philippheuer.twitch4j.model;

import lombok.Data;

/**
 * Model representing a video resolution.
 *
 * @author Philipp Heuer [https://github.com/PhilippHeuer]
 * @version %I%, %G%
 * @since 1.0
 */
@Data
public class VideoResolutions {

	private String medium;

	private String mobile;

	private String high;

	private String low;

	private String chunked;
}
