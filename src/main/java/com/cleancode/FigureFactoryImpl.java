package com.cleancode;

public class FigureFactoryImpl implements FigureFactory{

	@Override
	public Figure createFigure(String figureType) {
		switch(figureType) {
		
		case "circle":
			return new Circle();
			
			default:
				
		
		}
		return null;
	}

}
