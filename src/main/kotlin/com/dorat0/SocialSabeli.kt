package com.dorat0

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object SocialSabeli : ModInitializer {
    private val logger = LoggerFactory.getLogger("socialsabeli")

	override fun onInitialize() {
		logger.info("Hello Fabric world!")
	}
}