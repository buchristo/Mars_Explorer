# Mars_Explorer

Mars explorer was a Teamproject in our CodeCool curriculum.
I coded this project with two of my CodeCool colleagues.

We had a given map file and we had to convert this map in a 2d array and send out a rover to detect resources on mars to determine if it is colonizable.

If we run the programm the map gets overwritten with the "SpaceShip" where we deployed our rover, the path the rover took, and the resources it scanned on it's journey.

# Map Legend

  - Yellow S - the starting point of the rover
  - Purple dots - the path the rover took
  - green signs - resources the rover found
#
  - '%' are mineral resources
  - '*' are water resources
  - '#' are mountains
  - '&' are pits

# Win condition

The rover must find 4 mineral deposits within 1000 steps, if this goal is achieved we get the message that the planet is colonizable else we fail with a timeout.

# Movement pattern

We implemented two movement patterns for the rover:

  - the standard pattern is a simple random movement pattern where the rover can basically do whatever he wants.
  - in the second pattern the rover must travel in a straight line (also diagonal) until he hits a wall/obstacle, then he must change to a new direction and travel in a line again.
