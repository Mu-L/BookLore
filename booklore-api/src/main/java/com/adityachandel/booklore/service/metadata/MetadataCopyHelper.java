package com.adityachandel.booklore.service.metadata;

import com.adityachandel.booklore.model.entity.AuthorEntity;
import com.adityachandel.booklore.model.entity.BookMetadataEntity;
import com.adityachandel.booklore.model.entity.CategoryEntity;

import java.time.LocalDate;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MetadataCopyHelper {

    private final BookMetadataEntity metadata;

    public MetadataCopyHelper(BookMetadataEntity metadata) {
        this.metadata = metadata;
    }

    private boolean isLocked(Boolean lockedFlag) {
        return Boolean.TRUE.equals(lockedFlag);
    }

    public void copyTitle(Consumer<String> consumer) {
        if (!isLocked(metadata.getTitleLocked()) && metadata.getTitle() != null) {
            consumer.accept(metadata.getTitle());
        }
    }

    public void copySubtitle(Consumer<String> consumer) {
        if (!isLocked(metadata.getSubtitleLocked()) && metadata.getSubtitle() != null) {
            consumer.accept(metadata.getSubtitle());
        }
    }

    public void copyPublisher(Consumer<String> consumer) {
        if (!isLocked(metadata.getPublisherLocked()) && metadata.getPublisher() != null) {
            consumer.accept(metadata.getPublisher());
        }
    }

    public void copyPublishedDate(Consumer<LocalDate> consumer) {
        if (!isLocked(metadata.getPublishedDateLocked()) && metadata.getPublishedDate() != null) {
            consumer.accept(metadata.getPublishedDate());
        }
    }

    public void copyDescription(Consumer<String> consumer) {
        if (!isLocked(metadata.getDescriptionLocked()) && metadata.getDescription() != null) {
            consumer.accept(metadata.getDescription());
        }
    }

    public void copySeriesName(Consumer<String> consumer) {
        if (!isLocked(metadata.getSeriesNameLocked()) && metadata.getSeriesName() != null) {
            consumer.accept(metadata.getSeriesName());
        }
    }

    public void copySeriesNumber(Consumer<Float> consumer) {
        if (!isLocked(metadata.getSeriesNumberLocked()) && metadata.getSeriesNumber() != null) {
            consumer.accept(metadata.getSeriesNumber());
        }
    }

    public void copySeriesTotal(Consumer<Integer> consumer) {
        if (!isLocked(metadata.getSeriesTotalLocked()) && metadata.getSeriesTotal() != null) {
            consumer.accept(metadata.getSeriesTotal());
        }
    }

    public void copyIsbn13(Consumer<String> consumer) {
        if (!isLocked(metadata.getIsbn13Locked()) && metadata.getIsbn13() != null) {
            consumer.accept(metadata.getIsbn13());
        }
    }

    public void copyIsbn10(Consumer<String> consumer) {
        if (!isLocked(metadata.getIsbn10Locked()) && metadata.getIsbn10() != null) {
            consumer.accept(metadata.getIsbn10());
        }
    }

    public void copyAsin(Consumer<String> consumer) {
        if (!isLocked(metadata.getAsinLocked()) && metadata.getAsin() != null) {
            consumer.accept(metadata.getAsin());
        }
    }

    public void copyPageCount(Consumer<Integer> consumer) {
        if (!isLocked(metadata.getPageCountLocked()) && metadata.getPageCount() != null) {
            consumer.accept(metadata.getPageCount());
        }
    }

    public void copyLanguage(Consumer<String> consumer) {
        if (!isLocked(metadata.getLanguageLocked()) && metadata.getLanguage() != null) {
            consumer.accept(metadata.getLanguage());
        }
    }

    public void copyAuthors(Consumer<Set<String>> consumer) {
        if (!isLocked(metadata.getAuthorsLocked()) && metadata.getAuthors() != null) {
            Set<String> names = metadata.getAuthors().stream()
                    .map(AuthorEntity::getName)
                    .filter(n -> n != null && !n.isBlank())
                    .collect(Collectors.toSet());
            if (!names.isEmpty()) consumer.accept(names);
        }
    }

    public void copyCategories(Consumer<Set<String>> consumer) {
        if (!isLocked(metadata.getCategoriesLocked()) && metadata.getCategories() != null) {
            Set<String> cats = metadata.getCategories().stream()
                    .map(CategoryEntity::getName)
                    .filter(n -> n != null && !n.isBlank())
                    .collect(Collectors.toSet());
            if (!cats.isEmpty()) consumer.accept(cats);
        }
    }

    public void copyGoodreadsId(Consumer<String> consumer) {
        if (!isLocked(metadata.getGoodreadsIdLocked()) && metadata.getGoodreadsId() != null) {
            consumer.accept(metadata.getGoodreadsId());
        }
    }

    public void copyHardcoverId(Consumer<String> consumer) {
        if (!isLocked(metadata.getHardcoverIdLocked()) && metadata.getHardcoverId() != null) {
            consumer.accept(metadata.getHardcoverId());
        }
    }

    public void copyGoogleId(Consumer<String> consumer) {
        if (!isLocked(metadata.getGoogleIdLocked()) && metadata.getGoogleId() != null) {
            consumer.accept(metadata.getGoogleId());
        }
    }

    public void copyPersonalRating(Consumer<Double> consumer) {
        if (!isLocked(metadata.getPersonalRatingLocked()) && metadata.getPersonalRating() != null) {
            consumer.accept(metadata.getPersonalRating());
        }
    }
}
