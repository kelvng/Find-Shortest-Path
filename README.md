# GUI-MAP
Using Java language to write a GUI application that allows users to find the minimum path from a location to another

## Introduction

The increasingly advanced era will bring a large number of motorized vehicles, but if the number of motor vehicles is large, it will cause traffic congestion, environmental pollution and waste of fuel. route. Therefore, many routes will make people easily lost because they are too unfamiliar. According to statistics, the number of motor vehicles increased from 2.3% to 3.9% per year. A substantial number and solving those numbers is the problem that we cannot ban motor vehicles just to avoid traffic congestion because it will cause more economic damage than it can bring about. Motorized vehicles are an indispensable part of human life, they are an important tool for traveling, working, traveling and working. Other activities such as banning motorbikes will cause a great loss of money and time to other activities. When the number of motor vehicles increases significantly, traffic jams will occur because when joining in traffic, one or more different roads must be divided and a large number of motor vehicle drivers must be gathered in one place. This will cause traffic jams, making everyone feel uncomfortable and wasteful. Whether, harm the environment including waste of effort and time, a lot of this always happens on shifts, days off, ... With such a problem raised, I have tried to come up with That solution is to find the shortest route so that people can achieve their goal and avoid the intersection. Each person walking on a single road will help control, avoid traffic congestion, make vehicles can operate more efficiently, faster and will bring a significant economic benefit. because the intersection routes are smooth.

## DATA

Data is taken from http://overpass-turbo.eu/

## Interface

![alt text](https://github.com/nthanhkhang/GUI-MAP/blob/main/Interface.png)

## Find the shortest path 

In general, the shortest-time path, as the name implies, is the path which costs the shortest time of all possible paths from one place to another. In order to figure out such path, the time cost of each path should be able to be measured or calculated. However, in reality, the time cost of a journey not only depends on the fixed length of the roads which the driver chooses, but also depends on the complex traffic condition and the variable driving speed, so in reality, the shortest path is probably not the shortest-time path. The hinder factors of traffic are various, like the amount of vehicles, the number of pedestrians, weather condition and the road condition (width, pavement condition, gradient and visibility). The driving speed is also impacted by many factors, such as vehicle type, driver’s choice, traffic condition, weather and so on. Although there are methods to calculate the driving speed, like it is studied by Zhao (2010), but in reality, it is impossible to measure the speed of all vehicles on the roads, therefore, the time cost of motor vehicles’ travel is impossible to estimate without measuring it individually. According to law, while drivers are driving on the road, it should be speeding down when they drive across hospitals, schools and the pedestrian crossings, and motor vehicles must stop if the traffic lights turn to red. Base on this, the authors take fixed constructions, 

 
which are close to the roadside and where the divers must speed down (like hospitals, schools, residential areas and traffic lights) as the hinder factors of driving speed. The combination of those factors with the distance of each path will normalize the time cost of each route plan and thus present the most time efficient choice.  Providing the shortest-time route plan to the drivers, to make sure the motor vehicles running highly efficient is also my solution to traffic congestion. Taking the shortest-time route plan will also reduce the emission time of motor vehicles to diminish the greenhouse effect.
