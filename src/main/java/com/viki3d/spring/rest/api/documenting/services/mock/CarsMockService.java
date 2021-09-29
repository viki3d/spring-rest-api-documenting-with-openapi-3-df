package com.viki3d.spring.rest.api.documenting.services.mock;

import com.viki3d.spring.rest.api.documenting.api.ApiResponseMessage;
import com.viki3d.spring.rest.api.documenting.api.NotFoundException;
import com.viki3d.spring.rest.api.documenting.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 * Servicing the {@code CarsAPI} by simulating mock database.
 */
@Service
public class CarsMockService {

  private static List<Car> mockDb;
  
  static {
    mockDb = new ArrayList<Car>();
    mockDb.add(new Car(1L, "Mazda", "6", "red"));
    mockDb.add(new Car(2L, "Mazda", "3", "green"));
    mockDb.add(new Car(3L, "Infinity", "Q50", "gray"));
    mockDb.add(new Car(4L, "Infinity", "Q60", "black"));
  }
  
  private static long newId = 5L;
  
  private static long generateNewId() {
    return newId++;
  }

  public List<Car> list() {
    return mockDb;
  }

  public Optional<Car> get(long id) {
    return mockDb.stream().filter(car -> car.getId() == id).findFirst();
  }

  public long add(Car car) {
    long newId = generateNewId();
    car.setId(newId);
    mockDb.add(car);
    return newId;
  }
  
  public void delete(long id) throws NotFoundException {
    Car carToDelete = mockDb.stream().filter(c -> c.getId() == id).findFirst()
        .orElseThrow(() -> new NotFoundException(ApiResponseMessage.ERROR, "Car with id [" 
            + id + "] not found." ));
    mockDb.remove(carToDelete);
  }
  
  public void update(Car car) throws NotFoundException {
    Car carToUpdate = mockDb.stream()
        .filter(c -> c.getId() == car.getId()).findFirst()
        .orElseThrow(() -> new NotFoundException(ApiResponseMessage.ERROR, "Car not found."));
        
    carToUpdate.setBrand(car.getBrand());
    carToUpdate.setModel(car.getModel());
    carToUpdate.setColor(car.getColor());
  }
  
  public void replace(long id, Car car) throws NotFoundException {
    Car carToReplace = mockDb.stream()
        .filter(c -> c.getId() == car.getId()).findFirst()
        .orElseThrow(() -> new NotFoundException(ApiResponseMessage.ERROR, "Car with id [" 
                + id + "] not found." ));
        
    mockDb.remove(carToReplace);
    car.setId(id);
    mockDb.add(car);
  }
  
  public int countAll() {
    return mockDb.size();
  }
  
}
