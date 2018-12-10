CC := g++
OBJ_DIR := obj
LIB_DIR := lib
MKDIR ?= mkdir
DUMMY := $(shell $(MKDIR) -p $(OBJ_DIR) $(LIB_DIR))

vehicle.a: Vehicle.o VehicleBuilder.o
	ar rcs $(LIB_DIR)/$@ $(OBJ_DIR)/*.o 

Vehicle.o: Vehicle.cpp Vehicle.hpp
	$(CC) -c Vehicle.cpp -o $(OBJ_DIR)/$@ $(CFLAGS)

VehicleBuilder.o: VehicleBuilder.cpp VehicleBuilder.hpp
	$(CC) -c VehicleBuilder.cpp -o $(OBJ_DIR)/$@ $(CFLAGS)

clean:
	rm -rf $(OBJ_DIR)/*.o $(LIB_DIR)/*.a