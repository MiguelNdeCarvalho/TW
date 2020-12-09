package org.therestaurantmenu.tweb;

import java.util.HashMap;

public class Menu {
	static HashMap<String,String> entries = new HashMap<String,String>();
	
	static {
		entries.put("entrada1", "Queijo seco");
		entries.put("entrada2", "Queijo fresco ");
		entries.put("entrada3", "Salada de polvo");
		entries.put("entrada4", "Salada de cogumelos");
		entries.put("entrada5", "Salada de ovos de coderniz");
		
		entries.put("principal1", "Bochechas assadas no forno com batatinhas forno");
		entries.put("principal2", "Rabo de boi estufado em vinho tinto");
		entries.put("principal3", "Migas alentejanas com carne de porco frita");
		entries.put("principal4", "Lombinho de porco alentejano");
		entries.put("principal5", "Bifes de mil e uma maneiras");
		
		entries.put("bebida1", "Guarda Rios tinto");
		entries.put("bebida2", "Papa Figos tinto");
		entries.put("bebida3", "Dona Ermelinda Reserva tinto");
		
		entries.put("sobremesa1", "Sericaia");
		entries.put("sobremesa2", "Pudim Abade de Priscos");
		entries.put("sobremesa3", "Morgado");
	}
	
	static String getEntry(String id){
		return entries.get(id);	
	}
}
