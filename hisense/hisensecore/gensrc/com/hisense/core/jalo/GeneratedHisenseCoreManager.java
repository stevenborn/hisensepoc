/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 2024年3月27日 下午8:58:44                        ---
 * ----------------------------------------------------------------
 */
package com.hisense.core.jalo;

import com.hisense.core.constants.HisenseCoreConstants;
import com.hisense.core.jalo.ApparelProduct;
import com.hisense.core.jalo.ApparelSizeVariantProduct;
import com.hisense.core.jalo.ApparelStyleVariantProduct;
import com.hisense.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type <code>HisenseCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedHisenseCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("productType", AttributeMode.INITIAL);
		tmp.put("screenSet", AttributeMode.INITIAL);
		tmp.put("year", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HisenseCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HisenseCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HisenseCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( HisenseCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return HisenseCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productType</code> attribute.
	 * @return the productType
	 */
	public String getProductType(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, HisenseCoreConstants.Attributes.Product.PRODUCTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productType</code> attribute.
	 * @return the productType
	 */
	public String getProductType(final Product item)
	{
		return getProductType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productType</code> attribute. 
	 * @param value the productType
	 */
	public void setProductType(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, HisenseCoreConstants.Attributes.Product.PRODUCTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productType</code> attribute. 
	 * @param value the productType
	 */
	public void setProductType(final Product item, final String value)
	{
		setProductType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.screenSet</code> attribute.
	 * @return the screenSet
	 */
	public Set<String> getScreenSet(final SessionContext ctx, final Product item)
	{
		Set<String> coll = (Set<String>)item.getProperty( ctx, HisenseCoreConstants.Attributes.Product.SCREENSET);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.screenSet</code> attribute.
	 * @return the screenSet
	 */
	public Set<String> getScreenSet(final Product item)
	{
		return getScreenSet( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.screenSet</code> attribute. 
	 * @param value the screenSet
	 */
	public void setScreenSet(final SessionContext ctx, final Product item, final Set<String> value)
	{
		item.setProperty(ctx, HisenseCoreConstants.Attributes.Product.SCREENSET,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.screenSet</code> attribute. 
	 * @param value the screenSet
	 */
	public void setScreenSet(final Product item, final Set<String> value)
	{
		setScreenSet( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.year</code> attribute.
	 * @return the year
	 */
	public String getYear(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, HisenseCoreConstants.Attributes.Product.YEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.year</code> attribute.
	 * @return the year
	 */
	public String getYear(final Product item)
	{
		return getYear( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, HisenseCoreConstants.Attributes.Product.YEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.year</code> attribute. 
	 * @param value the year
	 */
	public void setYear(final Product item, final String value)
	{
		setYear( getSession().getSessionContext(), item, value );
	}
	
}
