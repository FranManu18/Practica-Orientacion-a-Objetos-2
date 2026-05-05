package factory;

import ar.edu.info.oo2.filtros.ImageFilter;
import ar.edu.info.oo2.filtros.Rainbow;
import ar.edu.info.oo2.pipes.ImageFilterPipe;

public class MonochromaticSequenceCreator extends FilterSequenceCreator{
	
	
	public MonochromaticSequenceCreator(ImageFilter filtro) {
		super(filtro);
	}


	@Override
	public void validar(ImageFilter filtro) {
		if (filtro instanceof Rainbow) {
            throw new RuntimeException(
                "Las secuencias monocromaticas no pueden incluir el filtro Rainbow"
            );
        }
	}
	
	
	@Override
	public  ImageFilterPipe crearPipe(ImageFilter filtro) {
		validar(filtro);
		return new ImageFilterPipe(filtro);
	}
}
