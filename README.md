# Forest Fire Simulator based on statistical model

This project from 2022 served as learning for Object-oriented programming (OOP) on Java.
### All meteorological parameters and land types contribute to an underlying statistical model that determines the fire's spreading direction and intensity over each iteration.

The Graphical interface allows the user to follow the course of the simulation as well as to set the different parameters:
- Vegetation density
- Wind power
- Wind direction
- Humidity rate
- Map size

 Simulation maps can be created under text files format of n*n characters separated by ';' with n ∈ {20, 60, 100, 150}.
 Each character represents the type of field of its cell (parcel of land)
 characters code mapping:
 - '1': Earth
 - '2': Meadow
 - '3': Water (for generating rivers of lake)
