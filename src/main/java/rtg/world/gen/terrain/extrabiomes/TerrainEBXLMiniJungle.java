package rtg.world.gen.terrain.extrabiomes;

import rtg.world.gen.terrain.BlendedHillEffect;
import rtg.world.gen.terrain.FunctionalTerrainBase;
import rtg.world.gen.terrain.GroundEffect;
import rtg.world.gen.terrain.PlateauEffect;


public class TerrainEBXLMiniJungle extends FunctionalTerrainBase
{
    public TerrainEBXLMiniJungle()
    {
        base = 68;

        BlendedHillEffect bumps = new BlendedHillEffect();
        bumps.height = 8;
        bumps.wavelength = 30;
        bumps.hillBottomSimplexValue = 0.4f; // not too common

        PlateauEffect bumpHeight = new PlateauEffect();
        bumpHeight.height = 0;// only a multiplier
        bumpHeight.topSimplexValue = 0.5f;
        bumpHeight.bottomSimplexValue = 0.1f;
        bumpHeight.wavelength = 80;
        bumpHeight.subordinate = bumps;

        height = bumpHeight.plus(new GroundEffect(2f));
    }
}
