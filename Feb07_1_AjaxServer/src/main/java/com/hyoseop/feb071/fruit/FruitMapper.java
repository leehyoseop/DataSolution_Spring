package com.hyoseop.feb071.fruit;

import java.util.List;

public interface FruitMapper {
	public abstract List<Fruit> getAllFruit();

	public abstract List<Fruit> SearchFruit(Fruit f);
}
