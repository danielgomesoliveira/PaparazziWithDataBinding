package com.test.paparazziwithdatabinding

import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule

@GlideModule
class PaparazziWithDataBindingGlideModule : AppGlideModule() {
    override fun isManifestParsingEnabled() = false
}