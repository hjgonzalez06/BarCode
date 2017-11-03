/**
 * @Autor Hiram J. Gonzalez
 * @Fecha 29/10/2017
 * @Descripción Programa para generar Códigos de Barra.
 */
package barcode;

import java.awt.Image;
import java.awt.datatransfer.*;
import java.io.IOException;

public class CopiarImagen implements Transferable {
    private Image img;
    
    public CopiarImagen(Image image){
        this.img = image;
    }
    
    @Override
    public DataFlavor[] getTransferDataFlavors(){
       return new DataFlavor[]{ DataFlavor.imageFlavor};
    }
    
    @Override
    public boolean isDataFlavorSupported(DataFlavor flavor){
        return DataFlavor.imageFlavor.equals(flavor);
    }
    
    public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
        if(!DataFlavor.imageFlavor.equals(flavor)){
            throw new UnsupportedFlavorException(flavor);
        }
        return img;
    } 
    
}
