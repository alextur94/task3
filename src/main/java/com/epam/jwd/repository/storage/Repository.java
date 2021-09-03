package com.epam.jwd.repository.storage;

import com.epam.jwd.repository.model.airplane.Airplane;
import com.epam.jwd.repository.model.airplane.CargoPlane;
import com.epam.jwd.repository.model.airplane.PassengerPlane;
import com.epam.jwd.repository.model.company.Company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repository {

    private static final List<Company> companies = new ArrayList<>();
    private static final List<Airplane> defaultAirplanes = new ArrayList<>();

    static {
        companies.add(new Company(
                "CompanyOne",
                Arrays.asList(
                        new PassengerPlane.Builder()
                                .withFuelConsumption(10)
                                .withManufacturer("Boeing")
                                .withModel("777")
                                .withRange(1000)
                                .withSeats(400)
                                .withId(1)
                                .build(),
                        new PassengerPlane.Builder()
                                .withFuelConsumption(12)
                                .withManufacturer("Boeing")
                                .withModel("787")
                                .withRange(1200)
                                .withSeats(500)
                                .withId(2)
                                .build(),
                        new CargoPlane.Builder()
                                .withFuelConsumption(20)
                                .withManufacturer("Boeing")
                                .withModel("767")
                                .withRange(1900)
                                .withPayload(4000)
                                .withId(3)
                                .build(),
                        new CargoPlane.Builder()
                                .withFuelConsumption(40)
                                .withManufacturer("Airbus")
                                .withModel("A300")
                                .withRange(4000)
                                .withPayload(8000)
                                .withId(4)
                                .build()
                )
        ));
        companies.add(new Company(
                "CompanyTwo",
                Arrays.asList(
                        new PassengerPlane.Builder()
                                .withFuelConsumption(10)
                                .withManufacturer("Boeing")
                                .withModel("777")
                                .withRange(1000)
                                .withSeats(400)
                                .withId(1)
                                .build(),
                        new PassengerPlane.Builder()
                                .withFuelConsumption(12)
                                .withManufacturer("Boeing")
                                .withModel("787")
                                .withRange(1200)
                                .withSeats(500)
                                .withId(2)
                                .build(),
                        new CargoPlane.Builder()
                                .withFuelConsumption(20)
                                .withManufacturer("Boeing")
                                .withModel("767")
                                .withRange(1900)
                                .withPayload(4000)
                                .withId(3)
                                .build(),
                        new CargoPlane.Builder()
                                .withFuelConsumption(40)
                                .withManufacturer("Airbus")
                                .withModel("A300")
                                .withRange(4000)
                                .withPayload(8000)
                                .withId(4)
                                .build()
                )
        ));
    }

    public static List<Airplane> getDefaultAirplanes(){
        return defaultAirplanes;
    }

    public static List<Company> findAllCompanies(){
        return companies;
    }
}
