<?php

declare(strict_types=1);

class Lasagna
{
    function expectedCookTime()
    {
        return 40;
    }

    function remainingCookTime($elapsed_minutes)
    {
        return 40 - $elapsed_minutes;
    }

    function totalPreparationTime($layers_to_prep)
    {
        return 2 * $layers_to_prep;
    }

    function totalElapsedTime($layers_to_prep, $elapsed_minutes)
    {
        return $this->totalPreparationTime($layers_to_prep) + $elapsed_minutes;
    }

    function alarm()
    {
        return 'Ding!';
    }
}
