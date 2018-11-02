CC := g++
CFLAGS := -std=c++17
OBJ_DIR := obj

main: main.o Vehicle.o VehicleBuilder.o
	$(CC) $(OBJ_DIR)/*.o -o $@ $(CFLAGS)

main.o: main.cpp
	$(CC) -c main.cpp -o $(OBJ_DIR)/$@ $(CFLAGS)

Vehicle.o: Vehicle.cpp Vehicle.hpp
	$(CC) -c Vehicle.cpp -o $(OBJ_DIR)/$@ $(CFLAGS)

VehicleBuilder.o: VehicleBuilder.cpp VehicleBuilder.hpp
	$(CC) -c VehicleBuilder.cpp -o $(OBJ_DIR)/$@ $(CFLAGS)

clean:
	rm -rf $(OBJ_DIR)/*.o main