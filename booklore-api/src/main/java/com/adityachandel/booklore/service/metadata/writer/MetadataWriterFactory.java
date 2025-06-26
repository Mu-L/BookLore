package com.adityachandel.booklore.service.metadata.writer;

import com.adityachandel.booklore.model.enums.BookFileType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MetadataWriterFactory {

    private final EpubMetadataWriter epubWriter;
    private final PdfMetadataWriter pdfWriter;

    @Autowired
    public MetadataWriterFactory(EpubMetadataWriter epubWriter, PdfMetadataWriter pdfWriter) {
        this.epubWriter = epubWriter;
        this.pdfWriter = pdfWriter;
    }

    public Optional<MetadataWriter> getWriter(BookFileType type) {
        return switch (type) {
            case EPUB -> Optional.of(epubWriter);
            case PDF -> Optional.of(pdfWriter);
            default -> Optional.empty();
        };
    }
}
