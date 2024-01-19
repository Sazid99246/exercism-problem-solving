class Lasagna
{
    public int ExpectedMinutesInOven() => 40;
    public int RemainingMinutesInOven(int lasagnaOnOven) => 40 - lasagnaOnOven;
    public int PreparationTimeInMinutes(int layers) => 2 * layers;
    public int ElapsedTimeInMinutes(int layers, int lasagnaOnOven) => PreparationTimeInMinutes(layers) + lasagnaOnOven;
}
