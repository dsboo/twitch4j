package me.philippheuer.twitch4j.events.event;

import lombok.Getter;
import lombok.Setter;
import me.philippheuer.twitch4j.events.Event;
import me.philippheuer.twitch4j.model.Channel;
import me.philippheuer.twitch4j.model.Cheer;

@Getter
@Setter
public class SubsOnlyDisabledEvent extends Event {

	private final Channel channel;

	public SubsOnlyDisabledEvent(Channel channel) {
		this.channel = channel;
	}

}
