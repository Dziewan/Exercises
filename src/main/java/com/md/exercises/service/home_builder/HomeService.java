package com.md.exercises.service.home_builder;

import java.util.List;
import com.md.exercises.exception.NotImplementedException;
import com.md.exercises.model.home_builder.Home;
import com.md.exercises.model.home_builder.MaterialsBag;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    private final List<MaterialsBag> MATERIAL_BAGS = List.of(
            MaterialsBag.builder().woodAmount(10).glassAmount(24).build(),
            MaterialsBag.builder().woodAmount(20).glassAmount(10).build(),
            MaterialsBag.builder().woodAmount(48).glassAmount(50).build()
    );

    public List<Home> buildHomes() {
        //TODO Zwróć listę zbudowanych domów bazując na materiałach podanych wyżej. Użyj streamu na liście materiałów oraz poczytaj o metodzie map()
        //TODO Każdy dom składa się ze ścian i okien -> 1 ściana = 4 stacki drewna -> 1 okno = 3 stacki szkła
        throw new NotImplementedException();
    }
}
