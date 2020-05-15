# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.inline_response2002 import InlineResponse2002  # noqa: E501
from openapi_server.models.inline_response2003 import InlineResponse2003  # noqa: E501
from openapi_server.models.inline_response2004 import InlineResponse2004  # noqa: E501
from openapi_server.models.inline_response2005 import InlineResponse2005  # noqa: E501
from openapi_server.models.inline_response500 import InlineResponse500  # noqa: E501
from openapi_server.test import BaseTestCase


class TestEnginesController(BaseTestCase):
    """EnginesController integration test stubs"""

    def test_engine_disable(self):
        """Test case for engine_disable

        Disable engines
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/engine/{engine_id}/disable'.format(engine_id=clamav_7_linux),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_engine_enable(self):
        """Test case for engine_enable

        Enable engines
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/engine/{engine_id}/enable'.format(engine_id=clamav_7_linux),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_engine_pin(self):
        """Test case for engine_pin

        Pin engine to prevent auto-updates
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
            'type': engine,
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/engine/{engine_id}/pin'.format(engine_id=clamav_7_linux),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_engine_unpin(self):
        """Test case for engine_unpin

        Unpin engine to prevent auto-updates
        """
        headers = { 
            'Accept': 'application/json',
            'apikey': 'apikey_example',
            'type': engine,
            'apikey': 'special-key',
        }
        response = self.client.open(
            '/admin/engine/{engine_id}/unpin'.format(engine_id=clamav_7_linux),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
