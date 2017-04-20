package com.profexo.controller.game;

import com.profexo.model.player.FullPlayer;
import com.profexo.model.player.PlayerDB;
import com.profexo.model.player.ResumedPlayer;

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
	
	public PlayerDB FullToDB(FullPlayer pl) {
		
		// TODO implementar a conves�o do objeto json para o objeto de persistencia.
		return new PlayerDB();
	
	}

}
