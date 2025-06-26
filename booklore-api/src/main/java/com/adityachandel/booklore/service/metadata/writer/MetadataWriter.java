package com.adityachandel.booklore.service.metadata.writer;

import com.adityachandel.booklore.model.entity.BookMetadataEntity;

import java.io.File;

public interface MetadataWriter {
    void writeMetadataToFile(File file, BookMetadataEntity metadata, String thumbnailUrl);
}
