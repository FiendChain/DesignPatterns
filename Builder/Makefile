CC := g++
CFLAGS := -std=c++17
OBJ_DIR := obj
VEHICLE_DIR := Vehicle
MKDIR := C:/cygwin64/bin/mkdir.exe

export CFLAGS, MKDIR

main: main.o vehicle.a
	$(CC) $(OBJ_DIR)/*.o $(VEHICLE_DIR)/lib/vehicle.a -o $@ $(CFLAGS)

main.o: main.cpp
	$(CC) -c main.cpp -o $(OBJ_DIR)/$@ $(CFLAGS)

vehicle.a:
	$(MAKE) -C $(VEHICLE_DIR)

clean:
	rm -rf $(OBJ_DIR)/*.o main
	$(MAKE) -C $(VEHICLE_DIR) clean