package factory;

import ar.edu.info.oo2.filtros.Artifacter;
import ar.edu.info.oo2.filtros.ImageFilter;
import ar.edu.info.oo2.filtros.Monochrome;
import ar.edu.info.oo2.filtros.Rainbow;
import ar.edu.info.oo2.pipes.ImageFilterPipe;

public class MultichromaticSequenceCreator extends FilterSequenceCreator{
	
	
	
	public MultichromaticSequenceCreator(ImageFilter filtro) {
		super(filtro);
	}


	@Override
	public void validar(ImageFilter filtro) {
		if (filtro instanceof Monochrome) {
            throw new RuntimeException(
                "Las secuencias multicromáticas no pueden incluir el filtro Monochrome"
            );
        }
	}
	
	
	@Override
	public  ImageFilterPipe crearPipe(ImageFilter filtro) {
		validar(filtro);
		return new ImageFilterPipe(filtro);
	}
}
