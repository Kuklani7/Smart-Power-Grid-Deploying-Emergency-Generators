**Smart Power Grid: Emergency Generator Deployment:**

This project provides an algorithmic solution for optimizing disaster recovery in electrical infrastructures. In the wake of a grid-wide failure,
the system calculates the most efficient route for power distribution from a central emergency generator to all sub-stations within a network.
**Project Overview:**
The application models the power grid as a weighted directed graph where nodes represent stations and edges represent transmission
lines with specific latency or restoration times. By implementing a high-performance version of Dijkstra’s Shortest Path Algorithm,
the system determines the minimum time required for electricity to reach every node in the grid.
**Technical Implementation:**
The software utilizes adjacency lists for memory-efficient representation of complex networks.
It employs a Priority Queue (Min-Heap) optimization to ensure a time complexity of O(E log V).
This efficiency allows the tool to scale effectively for large-scale municipal grids or complex industrial power systems.
The architecture includes a dedicated driver utility to parse network data and validate the accuracy of the calculated paths against various test cases.
