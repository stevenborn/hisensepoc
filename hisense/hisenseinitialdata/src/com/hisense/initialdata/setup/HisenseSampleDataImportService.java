/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.hisense.initialdata.setup;

import com.hisense.initialdata.constants.HisenseInitialDataConstants;
import de.hybris.platform.commerceservices.dataimport.impl.SampleDataImportService;
import de.hybris.platform.commerceservices.setup.AbstractSystemSetup;
import de.hybris.platform.commerceservices.setup.data.ImportData;
import de.hybris.platform.core.initialization.SystemSetupContext;
import org.apache.log4j.Logger;

import java.util.List;


/**
 * Implementation to handle specific Sample Data Import services to hisense.
 */
public class HisenseSampleDataImportService extends SampleDataImportService
{

	private static final Logger LOG = Logger.getLogger(HisenseSampleDataImportService.class);


	@Override
	public void execute(AbstractSystemSetup systemSetup, SystemSetupContext context, List<ImportData> importData) {
		super.execute(systemSetup, context, importData);
		if(context.getExtensionName().equalsIgnoreCase(HisenseInitialDataConstants.EXTENSIONNAME)){
			this.importExtraData(context);
		}
	}





	/**
	 * Imports the data related to ExtraData.
	 *
	 * @param context
	 *           the context used.
	 */
	private void importExtraData(SystemSetupContext context) {
		final String extensionName = context.getExtensionName();

		getSetupImpexService().importImpexFile(String.format("/%s/import/sampledata/productCatalogs/hisenseProductCatalog/promotions.impex", extensionName),
				false);

		getSetupImpexService().importImpexFile(String.format("/%s/import/sampledata/contentCatalogs/hisenseContentCatalog/cms-content.impex", extensionName),
				false);

		getSetupImpexService().importImpexFile(String.format("/%s/import/sampledata/contentCatalogs/hisenseContentCatalog/cms-content_en.impex", extensionName),
				false);

		getSetupImpexService().importImpexFile(String.format("/%s/import/sampledata/contentCatalogs/hisenseContentCatalog/cms-responsive-content.impex", extensionName),
				false);

		getSetupImpexService().importImpexFile(String.format("/%s/import/sampledata/contentCatalogs/hisenseContentCatalog/cms-responsive-content_en.impex", extensionName),
				false);
		// Story LMEC-86: import the email content
		getSetupImpexService().importImpexFile(String.format("/%s/import/sampledata/contentCatalogs/hisenseContentCatalog/email-content.impex", extensionName),
				false);
		getSetupImpexService().importImpexFile(String.format("/%s/import/sampledata/contentCatalogs/hisenseContentCatalog/email-content_en.impex", extensionName),
				false);
		getSetupImpexService().importImpexFile(String.format("/%s/import/sampledata/contentCatalogs/hisenseContentCatalog/email-contentslots.impex", extensionName),
				false);
		getSetupImpexService().importImpexFile(String.format("/%s/import/sampledata/contentCatalogs/hisenseContentCatalog/email-paragraphs.impex", extensionName),
				false);

		getSetupImpexService().importImpexFile(String.format("/%s/import/sampledata/contentCatalogs/hisenseContentCatalog/oauth.impex", extensionName),
				false);

	}





	@Override
	public boolean synchronizeProductCatalog(AbstractSystemSetup systemSetup, SystemSetupContext context, String catalogName, boolean syncCatalogs) {
		systemSetup.logInfo(context, String.format("Skip synchronizing Product Catalog [%s]", catalogName));
		return true;
	}

	@Override
	public boolean synchronizeContentCatalog(AbstractSystemSetup systemSetup, SystemSetupContext context, String catalogName, boolean syncCatalogs) {
		systemSetup.logInfo(context, String.format("Skip synchronizing Content Catalog [%s]", catalogName));
		return true;
	}
}
