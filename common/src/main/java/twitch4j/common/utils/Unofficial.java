package twitch4j.common.utils;

import java.lang.annotation.Documented;

/**
 * The Unofficial Annotation marks unofficial api endpoints.
 * <p>
 * The support of unofficial endpoints can break at any point.
 *
 * @author Philipp Heuer [https://github.com/PhilippHeuer]
 * @version %I%, %G%
 * @since 1.0 */

@Documented
public @interface Unofficial {

	/**
	 * Source of the unofficial endpoint
	 */
	String value();
}
