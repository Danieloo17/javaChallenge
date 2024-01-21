package exercise;

interface Nos   {
    public int iMetoda();
}

abstract class Picasso implements Nos   {
    public int iMetoda()    {
        return 7;
    }
}
class Klaun extends Picasso { }
class Akty extends Picasso  {
    public int iMetoda()    {
        return 5;
    }
}


