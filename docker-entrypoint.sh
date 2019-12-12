#!/bin/sh

# If Project in development
if [ "$PRODUCTION_ENV" ]; then
  echo "working"
# If Project in Production
fi
exec "$@"