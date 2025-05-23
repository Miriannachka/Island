import Simulation.Island
import Simulation.Simulation
fun main() {
    val island = Island(Config.ISLAND_WIDTH, Config.ISLAND_HEIGHT)
    island.populate()
    val simulation = Simulation(island)
    simulation.start()
}