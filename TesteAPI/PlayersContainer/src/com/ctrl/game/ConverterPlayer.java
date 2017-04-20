package com.ctrl.game;

import com.model.player.FullPlayer;
import com.model.player.ResumedPlayer;

public class ConverterPlayer {
	
	public ResumedPlayer FullToResumed(FullPlayer full) {
	
		ResumedPlayer rp = new ResumedPlayer();

		rp.setBaseId(full.getBaseId());
		rp.setId(full.getId());
		rp.setName(full.getName());
		rp.setPosition(full.getPosition());
		rp.setRating(full.getRating());	
		
		return rp;
	}

}
