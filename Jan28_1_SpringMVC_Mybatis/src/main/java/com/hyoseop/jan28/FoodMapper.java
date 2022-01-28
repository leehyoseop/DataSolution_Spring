package com.hyoseop.jan28;

import java.util.List;

public interface FoodMapper {
	public abstract int regFood(Food f);
	
	public abstract List<Food> selFood();
}
