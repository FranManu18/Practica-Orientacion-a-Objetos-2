package factory;

import ar.edu.info.oo2.filtros.ImageFilter;
import ar.edu.info.oo2.pipes.ImageFilterPipe;

public abstract class FilterSequenceCreator {
	protected ImageFilterPipe pipe;
	
	
	public abstract ImageFilterPipe crearPipe(ImageFilter filtro);
	
	// valida si el filtro es aceptable para esta secuencia
	public abstract void validar(ImageFilter filtro);

	public FilterSequenceCreator(ImageFilter filtro) {
		this.pipe=crearPipe(filtro);
	}
	
	// agrega un filtro respetando las reglas
	public FilterSequenceCreator addFilter(ImageFilter filtro) {
		validar(filtro);
		pipe.addFilter(filtro);
		return this;
	}
	
	// devuelve la secuencia lista para usar
	public ImageFilter build() {
        return pipe;
    }
	
}

