package guru.springframework.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.domain.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Long>{

	List<Ingredient> getIngredientsByDescription(String...description);
	
}
