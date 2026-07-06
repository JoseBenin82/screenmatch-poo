package com.aluracursos.screenmatch.excepcion;

public class ErroDuracionConversionException extends RuntimeException {
    private String  mensaje;
    public ErroDuracionConversionException(String mensaje) {

        this.mensaje=mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
